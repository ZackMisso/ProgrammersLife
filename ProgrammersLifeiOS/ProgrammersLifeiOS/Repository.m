//
//  Repository.m
//  ProgrammersLifeiOS
//
//  Created by Zackary T Misso on 7/6/15.
//  Copyright © 2015 Zackary Misso. All rights reserved.
//

#import "Repository.h"

@implementation Repository

-(id)init{
    if(self = [super init]){
        // to be implemented
    }
    return self;
}

// getter methods
-(NSString*)getName { return name; }
-(Feature*)getCurrentFeature { return currentFeature; }
-(float)getDesignScore { return designScore; }
-(int)getAdditions { return additions; }
-(int)getDeletions { return deletions; }

// setter methods
-(void)setName:(NSString*)value { name = value; }
-(void)setCurrentFeature:(Feature*)value { currentFeature = value; }
-(void)setDesignScore:(float)value { designScore = value; }
-(void)setAdditions:(int)value { additions = value; }
-(void)setDeletions:(int)value { deletions = value; }

@end