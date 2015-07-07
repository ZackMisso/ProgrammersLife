//
//  Player.h
//  ProgrammersLifeiOS
//
//  Created by Zackary T Misso on 7/6/15.
//  Copyright © 2015 Zackary Misso. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "BaseStats.h"
#import "SkillStats.h"
#import "PointStats.h"
#import "RepositoryContainer.h"
#import "PlayerStatus.h"

@interface Player : NSObject{
    RepositoryContainer* repositories;
    BaseStats* baseStats;
    SkillStats* skillStats;
    PointStats* pointStats;
    int hackerPoints;
    PlayerStatus status;
}

// getter methods
-(RepositoryContainer*)getRepositories;
-(BaseStats*)getBaseStats;
-(SkillStats*)getSkillStats;
-(PointStats*)getPointStats;
-(int)getHackerPoints;
-(PlayerStatus)getPlayerStatus;

// setter methods
-(void)setRepositories:(RepositoryContainer*)value;
-(void)setBaseStats:(BaseStats*)value;
-(void)setSkillStats:(SkillStats*)value;
-(void)setPointStats:(PointStats*)value;
-(void)setHackerPoints:(int)value;
-(void)setPlayerStatus:(PlayerStatus)value;

@end
