//
//  Skill.m
//  ProgrammersLifeiOS
//
//  Created by Zackary T Misso on 7/6/15.
//  Copyright © 2015 Zackary Misso. All rights reserved.
//

#import "Skill.h"

@implementation Skill

-(id)init{
    if(self = [super init]){
        requirements = [[NSMutableArray alloc]init];
        name = @"";
        level = 0;
        currentPts = 0;
        ptsToGo = 100;
        unlocked = false;
    }
    return self;
}

-(void)levelUp{
    // to be implemented
}

-(void)unlock{
    [requirements removeAllObjects];
    requirements = NULL;
    unlocked = true;
}

-(BOOL)checkRequirements{
    for(int i = 0; i < [requirements count]; i++)
        if(![(SkillRequirement*)[requirements objectAtIndex:i] checkRequirement])
            return NO;
    [self unlock];
    return YES;
}

// getter methods
-(NSMutableArray*)getRequirements { return requirements; }
-(NSString*)getName { return name; }
-(int)getLevel { return level; }
-(int)getCurrentPts { return currentPts; }
-(int)getPtsToGo { return ptsToGo; }
-(BOOL)getUnlocked { return unlocked; }

// setter methods
-(void)setRequirements:(NSMutableArray*)value { requirements = value; }
-(void)setName:(NSString*)value { name = value; }
-(void)setLevel:(int)value { level = value; }
-(void)setCurrentPts:(int)value { currentPts = value; }
-(void)setPtsToGo:(int)value { ptsToGo = value; }
-(void)setUnlocked:(BOOL)value { unlocked = value; }

@end